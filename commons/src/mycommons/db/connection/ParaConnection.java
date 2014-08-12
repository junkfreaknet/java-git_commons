package mycommons.db.connection;

public class ParaConnection {

	//parameters for db connection
	//private String host;//"host name" or "ip address"
	//private String hostAddress;
	//private String dbName;
	//private String userName;
	//private String passWord;
	//private String forName;
	//private String port;
	//new-s
	private mycommons.db.connection.Host host;
	private mycommons.db.connection.DataBase database;
	private mycommons.db.connection.User user;
	private mycommons.db.connection.Password password;
	private mycommons.db.connection.ForName forName;
	private mycommons.net.tcp.Port port;
	
	//constructors
	public ParaConnection(){
		
	}
	
	public ParaConnection(mycommons.db.connection.ParaConnection source){
		this.forName=source.getForName();
		this.host=source.getHost();
		this.port=source.getPort();
		this.database=source.getDataBase();
		this.user=source.getUser();
		this.password=source.getPassWord();
	}
	public ParaConnection(mycommons.db.connection.ForName inForName,mycommons.db.connection.Host inHost,mycommons.net.tcp.Port inPort,mycommons.db.connection.DataBase inDataBase,mycommons.db.connection.User inUser,mycommons.db.connection.Password inPassWord){
		this.forName=inForName;
		this.host=inHost;
		this.port=inPort;
		this.database=inDataBase;
		this.user=inUser;
		this.password=inPassWord;
		
	}
	//constructor common
	//private methods
	//public methods
	//get methods
	public mycommons.db.connection.ForName getForName(){
		return this.forName;
	}
	public mycommons.db.connection.Host getHost(){
		return this.host;
	}
	public mycommons.net.tcp.Port getPort(){
		return this.port;
	}
	public mycommons.db.connection.DataBase getDataBase(){
		return this.database;
	}
	public mycommons.db.connection.User getUser(){
		return this.user;
	}
	public mycommons.db.connection.Password getPassWord(){
		return this.password;
	}
	//set For Name
	public void setForName(String source){
		this.forName.setValue(source);
	}
	public void setForName(mycommons.db.connection.ForName source){
		this.forName.setValue(source);
	}
	//set host
	public void setHost(String source){
		this.host.setName(source);
	}
	public void setHost(mycommons.db.connection.Host source){
		this.host.setName(source);
	}
	//set port
	public void setPort(String source){
		this.port.setValue(source);
	}
	public void setPort(mycommons.net.tcp.Port source){
		this.port.setValue(source);
	}
	//set db
	public void setDataBase(String source){
		this.database.setName(source);
	}
	public void setDataBase(mycommons.db.connection.DataBase source){
		this.database.setName(source);
	}
	//set user
	public void setUser(String source){
		this.user.setName(source);
	}
	public void setUser(mycommons.db.connection.User source){
		this.user.setName(source);
	}
	//set pw
	public void setPassWord(String source){
		this.password.setName(source);
	}
	public void setPassWord(mycommons.db.connection.Password source){
		this.password.setName(source);
	}
}