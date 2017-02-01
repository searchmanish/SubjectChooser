package manish.subjectchooser.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo on 31-01-2017.
 */

public class MyData {

    private static final String[] subjects = {"History", "GeneralAwareness", "Maths"};

    private static final int[] icons = {android.R.drawable.ic_dialog_alert, android.R.drawable.ic_btn_speak_now,
            android.R.drawable.ic_menu_edit};


    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        for (int x = 0; x <= 4; x++)
            for (int i = 0; i < subjects.length && i < icons.length; i++) {
                ListItem item = new ListItem();
                item.setSubjects(subjects[i]);
                item.setImgResId(icons[i]);
                data.add(item);
            }
        return data;
    }
}
