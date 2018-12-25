package net.firestaff.mcp.LABInfiniteWebView.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
public class UserDBModel implements Serializable {

    //private @Id UserModel owner;

    private List<UserPatternsModel> userPatterns;
}
