package manish.subjectchooser.model;

/**
 * Java Representation of our data to be displayed in Recylerview
 * Created by Lenovo on 31-01-2017.
 */

public class ListItem {

    private String subjects;
    private int imgResId;

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }
}
