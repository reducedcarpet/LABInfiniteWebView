package net.firestaff.mcp.LABInfiniteWebView.model;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor
public class GlobalDBModel implements Serializable {

    private @Id @GeneratedValue Long id;

    private PatternModel pattern;

    private boolean userCreated;
    private UserModel userModel;
    private String framework;
    private String propTypes;
}

