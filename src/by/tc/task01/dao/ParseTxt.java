package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTxt {

    private final static String txtDirectory = "resources\\appliances_db.txt";


    public List<String> findLines(Criteria criteria) {

        BufferedReader document = null;
        try {
            document = new BufferedReader(new FileReader(txtDirectory));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line;
        List<String> txtLines = new ArrayList<>();
        boolean isOk = false;
        Pattern pattern;
        Matcher matcher;
        try {
            while ((line = document.readLine()) != null) {

                if (line.toUpperCase().startsWith(criteria.getGroupSearchName().toUpperCase())) {

                    for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
                        String paramRegex = "\\s"+entry.getKey() + "=" + entry.getValue() + "[\\,||\\;]";
                        pattern = Pattern.compile(paramRegex,Pattern.CASE_INSENSITIVE);
                        matcher = pattern.matcher(line);
                        isOk = matcher.find();
                        if (!isOk) {
                            break;
                        }
                    }

                    if (isOk) {
                        txtLines.add(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return txtLines;
    }

}
