package info.quazi.rest.entity;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.jboss.seam.annotations.Name;

import lombok.Data;

@Name("userEntity")
@Data
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {
	protected String userName;
	protected String password;
	protected String email;
	protected Boolean enabled;
	protected List<String> roles=new ArrayList<>();
	protected String Company;
}
