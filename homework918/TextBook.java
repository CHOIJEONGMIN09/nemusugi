package ch3;

public class TextBook extends Book {
    private String subject; // 과목명

    public TextBook() {}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

 
    public void showInfo() {
        super.showInfo();
        System.out.println("과목명: " + subject);
    }
}
