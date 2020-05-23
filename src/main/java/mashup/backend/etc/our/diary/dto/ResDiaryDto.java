package mashup.backend.etc.our.diary.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mashup.backend.etc.our.diary.entity.Diary;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class ResDiaryDto {
    private long diaryId;
    private String writerName;
    private String title;
    private String contents;
    private Date createTime;
    private Date updateTime;

    public ResDiaryDto(Diary diary, String writerName){
        this.diaryId = diary.getDiaryId();
        this.writerName = writerName;
        this.title = diary.getTitle();
        this.contents = diary.getContents();
    }
}
