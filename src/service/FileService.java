package service;

import jxl.Workbook;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileService {
    private static final String TITLE = "Players";
    private static final String SURNAME = "Surname";
    private static final String LAST_NAME = "Last Name";
    private static final String DWZ = "DWZ";

    private File file;

    public void createFile() throws IOException {
        String fileName = buildFileName();
        String username = System.getProperty("user.name");
        file = new File("C:\\Users\\" + username + "\\Documents\\", fileName + ".xls");
        if (!file.exists()) {
            try {
                WritableWorkbook writableWorkbook = Workbook.createWorkbook(file);
                writableWorkbook.createSheet("test", 0);
                writableWorkbook.write();
                writableWorkbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (WriteException e) {
                e.printStackTrace();
            }
        }
    }

    private String buildFileName() {
        Date date = java.util.Calendar.getInstance().getTime();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy_HH.mm");
        String dateString = dateFormatter.format(date);
        return "Tournament_" + dateString;
    }
}
