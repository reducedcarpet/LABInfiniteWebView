package net.firestaff.mcp.LABInfiniteWebView.model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor  @ToString
public class UserPatternsModel implements Serializable {

    private @Id @GeneratedValue Long id;

    private PatternModel pattern;

    private String propTypes;

    private boolean created;

    private boolean tracked;
}
