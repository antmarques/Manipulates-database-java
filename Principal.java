package atividadeverificadora;
import java.sql.ResultSet; 

/*PARA REALIZAR CADA FUNÇÃO NA TABLE, TIRE OS "//" DA FRENTE DO CÓDIGO E COLOCA AS "//" NA
  FRENTE DAS OUTRAS LINHAS QUE NÃO IRÁ UTILIZAR.
*/

public class Principal {

	public static void main(String[] args) {
		ConexaoBd con = new ConexaoBd();
		
		//AQUI COMEÇA O CREATE TABLE
		
		String sql = "CREATE TABLE agenda (id serial, name varchar(100), telefone int PRIMARY KEY (id))";
		int cria = con.insereSQL(sql);
		if (cria == 0){
			System.out.println("Tabela criada com sucesso.");
		}else {
          System.out.println("Tabela não criada.");
		}
		//AQUI TERMINA O CREATE TABLE
		
		//AQUI COMEÇA O INSERT
        
		//String sql = "INSERT into agenda (id, name, telefone)" + 
		             //"values (default, 'João Carlos'," + "'997526091')";
        //int res = con.insereSQL(sql);
        //if (res > 0){
			//System.out.println("Cadastro realizado com sucesso");
		//}else {
			//System.out.println("Erro no Cadastro");
		//}
        //AQUI TERMINA O INSERT
        
        //AQUI COMEÇA O SELECT
		
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
        //AQUI TERMINA O SELECT
	    
        //AQUI COMEÇA O DELETE
		
		//String sql = "DELETE FROM agenda WHERE id = 4"; 
		//int res = con.insereSQL(sql);
		//if (res > 0){
			//System.out.println("Deleção concluída");
	   //}else {
		   //System.out.println("Erro na Deleção");
	   //}
	   //AQUI TERMINA O DELETE
        
       //AQUI COMEÇA O UPDATE
	   
		//String sql = "UPDATE agenda SET telefone = 995678045 WHERE id = 4 ";	
	   
	   //int res = con.insereSQL(sql);
	   //if (res > 0){
		   //System.out.println("Alteração concluída");  
	   //}else {
		   //System.out.println("Erro na Alteração");
	   //}
	}	   
}	   //AQUI TERMINA O UPDATE
