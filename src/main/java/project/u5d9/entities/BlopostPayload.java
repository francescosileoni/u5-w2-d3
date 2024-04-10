package project.u5d9.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class BlogpostPayload {
    private int authorId;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;
}
