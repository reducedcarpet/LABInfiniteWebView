package net.firestaff.mcp.LABInfiniteWebView.model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @ToString
public class PatternModel implements Serializable {

    private @Id @GeneratedValue Long id;

    private String patternName;
    private String category;
    private String alias;
    private int propNumber;
    private String concepts;
    private PropPatternModel propOne;
    private PropPatternModel propTwo;
    private PropPatternModel propThree;
    private PropPatternModel propFour;
}
