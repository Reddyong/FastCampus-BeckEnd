package fc.java.course1.model;

public class MovieVO {
    private String title;
    private int openDate;
    private String mainActor;
    private String genre;
    private int runningTime;
    private int grade;

    public MovieVO() {

    }

    public MovieVO(String title, int openDate, String mainActor, String genre, int runningTime, int grade) {
        this.title = title;
        this.openDate = openDate;
        this.mainActor = mainActor;
        this.genre = genre;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOpenDate() {
        return openDate;
    }

    public void setOpenDate(int openDate) {
        this.openDate = openDate;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", openDate=" + openDate +
                ", mainActor='" + mainActor + '\'' +
                ", genre='" + genre + '\'' +
                ", runningTime=" + runningTime +
                ", grade=" + grade +
                '}';
    }
}
