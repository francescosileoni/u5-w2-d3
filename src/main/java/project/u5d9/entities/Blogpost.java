package project.u5d9.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Blogpost {
    private int id;
    private int authorId;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;
}
