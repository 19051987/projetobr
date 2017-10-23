package cpf2Via;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CpfService {
 public static String getCpf2ViaResponse() {
 
 String response = null;
 try {
     //Chama uma classe especial de texto que e mais facil de manipular variaves de texto, e um Construtor de String(texto)
     StringBuilder result = new StringBuilder();
     //Variavel de linha, usado pra armazenar no loopa
     String line;  
     
     //Cria variavel com o endereco do webserice
     URL url = new URL("http://argentumws.caelum.com.br/negociacoes");
     //Conecta ao WebService
     HttpURLConnection connection = (HttpURLConnection) url.openConnection();
     //Faz a leitura da Resposta do WebService
     InputStream content = connection.getInputStream();
     //Transforma essa leitura em um Objeto que o java pode manipular
     BufferedReader reader = new BufferedReader(new InputStreamReader(content));
     // Loop para ler cada linha do Objeto BufferedReader que contem os dados da resposta do Webservice
     while((line = reader.readLine()) != null) {
      //Joga o conteudo da linha na variavel result, o construtor de texto
         result.append(line);
     }
     //Serve apenas para imprimir no console o xml lido   
     System.out.println(result.toString());
     response = result.toString();
     // faz parte do Try, e um gerenciador de erros, toda vez que acontece algum erro na execucao do codigo o try joga esse erro para o catch 
    }catch(Exception e){
     //imprimi no console o erro
     System.out.println(e.getLocalizedMessage());
    }
    return response;
 
}

}