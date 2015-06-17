package jpa.po;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "users")
public class User {
	@Id
	// @GeneratedValue(strategy=GenerationType.AUTO)
	// @GeneratedValue(strategy=GenerationType.)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String uname;
	private int age;
	@Column(columnDefinition="char(2)")
	//@org.hibernate.annotations.TypeType(type="yes_no")
	private boolean sex;
	@Embedded
	@AttributeOverrides({@AttributeOverride(name="firstName",column=@Column(name="first_name"))
	,@AttributeOverride(name="lastName",column=@Column(name="last_name"))})
	private FullName fullName;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="tels",joinColumns=@JoinColumn(name="u_id"))
	
	private List<String> tels=new ArrayList<String>();
	
	
	
	public List<String> getTels() {
		return tels;
	}

	public void setTels(List<String> tels) {
		this.tels = tels;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@OneToMany(mappedBy = "u", fetch = FetchType.LAZY)
	private Set<Addr> addrs = new HashSet<Addr>();

	public Set<Addr> getAddrs() {
		return addrs;
	}

	public void setAddrs(Set<Addr> addrs) {
		this.addrs = addrs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
