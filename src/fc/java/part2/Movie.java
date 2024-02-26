class Movie {
    private String name;
    private String openDate;
    private String hero;
    private String genre;
    private int runningTime;
    private String grade;

    public Movie() {
    }

    public Movie(String name, String openDate, String hero, String genre, int runningTime, String grade) {
        this.name = name;
        this.openDate = openDate;
        this.hero = hero;
        this.genre = genre;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", openDate='" + openDate + '\'' +
                ", hero='" + hero + '\'' +
                ", genre='" + genre + '\'' +
                ", runningTime=" + runningTime +
                ", grade='" + grade + '\'' +
                '}';
    }
}
