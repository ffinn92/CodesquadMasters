
public enum DataStructure {

    aaaa("제목1", 12), aaab("제목2", 1), aabb("제목3", 7), abbb("제목4", 4), bbbb("제목5", 9), bbbc("제목6", 15),
    bbcc("제목7", 2), bccc("제목8", 3), cccc("제목9", 14), cccd("제목10", 10), ccdd("제목11", 12), cddd("제목12", 4), dddd("제목13", 1);

    private final String subject;
    private final int runningTime;

    public static DataStructure toName(String id){
        return valueOf(id);
    }

    DataStructure(String subject, int runningTime) {
        this.subject = subject;
        this.runningTime = runningTime;
    }

    public String getSubject() {
        return subject;
    }

    public int getRunningTime() {
        return runningTime;
    }

}


