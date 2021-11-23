package atividadeverificadora;
import java.sql.ResultSet; 

/*To perform each function in the table, put "//" in front and at the end "//" of the function you will not use. 
*/

public class Principal {

	public static void main(String[] args) {
		ConexaoBd con = new ConexaoBd();
		
		//Here start the Table Create
		
		String sql = "CREATE TABLE agenda (id serial PRIMARY KEY , name varchar(100), telefone int);";
		int cria = con.insereSQL(sql);
		if (cria == 0){
			System.out.println("Tabela criada com sucesso.");
		}else {
          		System.out.println("Tabela não criada.");
		}
		//Here finished the Table Create
		
		//Here Start the Insert
        
		//String sql = "INSERT into agenda (id, name, telefone)" + 
		             //"values (default, 'João Carlos'," + "'997526091')";
        	//int res = con.insereSQL(sql);
        	//if (res > 0){
			//System.out.println("Cadastro realizado com sucesso");
		//}else {
			//System.out.println("Erro no Cadastro");
		//}
        //Here finished the Insert
        
        //Here started the Select
		
        //String sql = "Select * from agenda";
        //ResultSet rs = con.executaBusca(sql);
        //try {
		//while (rs.next()){
			//int id = rs.getInt("id");
			//String name = rs.getString("name");
			//int telefone = rs.getInt("telefone");
			//System.out.println(id+" - "+name+" - "+telefone);
			//}
	//} catch (Exception e) {
		//e.printStackTrace();
	//} 
        //Here finished the Select
	    
        //Here start the Delete
		
	//String sql = "DELETE FROM agenda WHERE id = 4"; 
	//int res = con.insereSQL(sql);
	//if (res > 0){
		//System.out.println("Deleção concluída");
	//}else {
		//System.out.println("Erro na Deleção");
	//}
	//Here finished the Delete
        
       //Here start the Update
	   
	//String sql = "UPDATE agenda SET telefone = 995678045 WHERE id = 4 ";	
	//int res = con.insereSQL(sql);
	//if (res > 0){
		//System.out.println("Alteração concluída");  
	//}else {
		//System.out.println("Erro na Alteração");
	//}
	}	   
}	//Here finished the Update
