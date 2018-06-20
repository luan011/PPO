# Construtor

Os construtores são os responsáveis por criar o objeto em memória ou instanciar a classe que foi definida
 
class test{

    public test() {
    
        System.out.println(" Construtor");
	
    }
    
}

# Instanciação
 
Instanciação é quando se faz uma copia de uma classe existente
 
public class Instanciacao {

    private Menu menu= new Menu ();
    
}

# Palavra reservada new
Usa-se new para instanciar objetos
 
# Palavra reservada instanciof
O operador instanceof serve para verificar se determinado objeto é uma instância de um determinado tipo classe ou interface.
 
# Encapsulamento
É uma forma de reaproveitar código e também esconde-lo
 
# Palavra reservada this
 
É usado para fazer auto-referência ao próprio contexto em que se encontra e sempre será a própria classe ou o objeto já instanciado.
 
# Getters/Setters
GET é quando você quer pegar um valor.

SET é quando você deseja setar ou enviar algo, algum valor.
 
 
# Palavra reservada public/private
 
Public todos tem acesso a classe

No Private a única classe que tem acesso ao atributo é a própria classe que o define

public class Test{

    public int Publico;
    
    private int Privado;
    
}
 
# Assinatura de método
A assinatura é o jeito de identificar um método de forma única.Em linguagens onde vários métodos podem ter o mesmo nome, você precisa ter uma outra forma de evitar a ambiguidade.
 
# Sobrecarga de método
 
Sobrecarga de método permite a existência de vários métodos de mesmo nome, porém com assinaturas levemente diferentes ou seja variando no número , tipo de argumentos , no valor de retorno e até variáveis diferentes. 
 
# Escopo de Classe		
 
Escopo é o nome que se dá aos limites de uma variável, em java uma variável só é valida dentro das chaves onde é declarada,se declara dentro do método só vale dentro do metodo, porem se declarada dentro da classe (como atributo) ela vale na classe inteira incluindo no método 
 
public class Escopo{  
   
 private int num;  
  
  public void metodoA(){  
    int a = 0;  
    int num = 4;  
  }  
   
}  
# Escopo de Objeto
 
Escopo do objeto é onde ele está, dentro da classe, sendo um atributo, ou dentro de um método, sendo uma variável.
 
public static void main(String args[]){

	Aluno aluno1;
	aluno1= new Aluno(“Luan”, 19, ’M’);
}
 
 
 
# Relacionamento de dependência
 
Ocorre quando uma classe utiliza os serviços de outra classe. Ocorre no método da classe. Símbolo UML "- - - - - >".
 
# Relacionamento de Agregação
 
É quando duas classes têm uma relação todo-parte, a parte consegue existir sem o todo. Atributo da Classe. Símbolo UML "-------<>"
 
# Relacionamento de Composição
 
É quando duas classes têm uma todo-parte, a parte não consegue existir sem o todo.Atributo da Classe.Símbolo UML "-------<//>"
 
