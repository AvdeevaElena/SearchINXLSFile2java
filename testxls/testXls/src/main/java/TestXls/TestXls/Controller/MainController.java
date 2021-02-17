package TestXls.TestXls.Controller;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

@Controller
public class MainController {
    @Value ("")
    private static String message = "";
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("test", this.message);
        return "index";
    }

    @PostMapping("/Search")
    public String addUser(String value) throws Exception {
// получаем файл в формате xls
        FileInputStream file = new FileInputStream(new File("./math.xls"));
        XSSFWorkbook wbks = new XSSFWorkbook(file);
        Sheet s =  wbks.getSheetAt(0);
        Boolean res = false;
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Row rowitr = (Row)itr.next();
            Iterator cellitr = rowitr.cellIterator();
            while(cellitr.hasNext()){
                Cell cell= (Cell)cellitr.next();
                switch(cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        if (value.equals(cell.getStringCellValue()))
                            res = true;
                             break;
                }
            }
        }
        if (res == true)  this.message = "Найдено";
        else this.message = "Не Найдено";
        return "redirect:/";
    }
}

