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
public class UserModel implements Serializable {

    private @Id @GeneratedValue Long id;

    private String userName;
    private String accountName;
    private String alias;
    private String email;

    @Access(AccessType.PROPERTY)
    @OneToMany(targetEntity=UserPatternsModel.class, mappedBy="id",
            fetch= FetchType.EAGER)
    private List<UserPatternsModel> userDB;

}
