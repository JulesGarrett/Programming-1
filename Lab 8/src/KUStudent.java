public class KUStudent {
private String stud_fname;
private String stud_lname;
private String stud_kuid;
private String stud_dpt;
public void SetName(String fname, String lname){
	stud_fname=fname;
	stud_lname=lname;
}
public void SetKuinfo(String kuid, String dpt){
	stud_kuid=kuid;
	stud_dpt=dpt;
}
public String get_fname(){
	return stud_fname;
}
public String get_lname(){
	return stud_lname;
}
public String get_id(){
	return stud_kuid;
}
public String get_dept(){
	return stud_dpt;
}
}
