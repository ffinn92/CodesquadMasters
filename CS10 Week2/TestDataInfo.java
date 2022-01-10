import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDataInfo {

    @Test
    @DisplayName("데이터 출력 테스트")
    void dataInfo() {
        assertEquals("제목1(aaaa):12", DataStructure.aaaa.getSubject() + "(aaaa)" + ":" + DataStructure.aaaa.getRunningTime());
        assertEquals("제목2(aaab):1", DataStructure.aaab.getSubject() + "(aaab)" + ":" + DataStructure.aaab.getRunningTime());
        assertEquals("제목3(aabb):7", DataStructure.aabb.getSubject() + "(aabb)" + ":" + DataStructure.aabb.getRunningTime());
        assertEquals("제목4(abbb):4", DataStructure.abbb.getSubject() + "(abbb)" + ":" + DataStructure.abbb.getRunningTime());
        assertEquals("제목5(bbbb):9", DataStructure.bbbb.getSubject() + "(bbbb)" + ":" + DataStructure.bbbb.getRunningTime());
        assertEquals("제목6(bbbc):15", DataStructure.bbbc.getSubject() + "(bbbc)" + ":" + DataStructure.bbbc.getRunningTime());
        assertEquals("제목7(bbcc):2", DataStructure.bbcc.getSubject() + "(bbcc)" + ":" + DataStructure.bbcc.getRunningTime());
        assertEquals("제목8(bccc):3", DataStructure.bccc.getSubject() + "(bccc)" + ":" + DataStructure.bccc.getRunningTime());
        assertEquals("제목9(cccc):14", DataStructure.cccc.getSubject() + "(cccc)" + ":" + DataStructure.cccc.getRunningTime());
        assertEquals("제목10(cccd):10", DataStructure.cccd.getSubject() + "(cccd)" + ":" + DataStructure.cccd.getRunningTime());
        assertEquals("제목11(ccdd):12", DataStructure.ccdd.getSubject() + "(ccdd)" + ":" + DataStructure.ccdd.getRunningTime());
        assertEquals("제목12(cddd):4", DataStructure.cddd.getSubject() + "(cddd)" + ":" + DataStructure.cddd.getRunningTime());
        assertEquals("제목13(dddd):1", DataStructure.dddd.getSubject() + "(dddd)" + ":" + DataStructure.dddd.getRunningTime());

    }


//    "aaaa", "aaab", "aabb", "abbb", "bbbb", "bbbc", "bbcc", "bccc", "cccc", "cccd", "ccdd", "cddd", "dddd"
//

}
