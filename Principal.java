package atividadeverificadora;
import java.sql.ResultSet; 

/*PARA REALIZAR CADA FUN��O NA TABLE, TIRE OS "//" DA FRENTE DO C�DIGO E COLOCA AS "//" NA
  FRENTE DAS OUTRAS LINHAS QUE N�O IR� UTILIZAR.
*/

public class Principal {

	public static void main(String[] args) {
		ConexaoBd con = new ConexaoBd();
		
		//AQUI COME�A O CREATE TABLE
		
		String sql = "CREATE TABLE agenda (id serial, name varchar(100), telefone int PRIMARY KEY (id))";
		int cria = con.insereSQL(sql);
		if (cria == 0){
			System.out.println("Tabela criada com sucesso.");
		}else {
          System.out.println("Tabela n�o criada.");
		}
		//AQUI TERMINA O CREATE TABLE
		
		//AQUI COME�A O INSERT
        
		//String sql = "INSERT into agenda (id, name, telefone)" + 
		             //"values (default, 'Jo�o Carlos'," + "'997526091')";
        //int res = con.insereSQL(sql);
        //if (res > 0){
			//System.out.println("Cadastro realizado com sucesso");
		//}else {
			//System.out.println("Erro no Cadastro");
		//}
        //AQUI TERMINA O INSERT
        
        //AQUI COME�A O SELECT
		
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
	    
        //AQUI COME�A O DELETE
		
		//String sql = "DELETE FROM agenda WHERE id = 4"; 
		//int res = con.insereSQL(sql);
		//if (res > 0){
			//System.out.println("Dele��o conclu�da");
	   //}else {
		   //System.out.println("Erro na Dele��o");
	   //}
	   //AQUI TERMINA O DELETE
        
       //AQUI COME�A O UPDATE
	   
		//String sql = "UPDATE agenda SET telefone = 995678045 WHERE id = 4 ";	
	   
	   //int res = con.insereSQL(sql);
	   //if (res > 0){
		   //System.out.println("Altera��o conclu�da");  
	   //}else {
		   //System.out.println("Erro na Altera��o");
	   //}
	}	   
}	   //AQUI TERMINA O UPDATE
