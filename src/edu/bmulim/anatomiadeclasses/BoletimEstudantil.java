package edu.bmulim.anatomiadeclasses;
public class BoletimEstudantil {
    public static void main(String[] args) {
        //identado
        int mediaFinal = 4;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("PROVA FINAL");
        else
            System.out.println("APROVADO");
    }  
}
/* 
public class BoletimEstudantil {
public static void main(String[] args) {
int mediaFinal = 4;
if(mediaFinal<6)
System.out.println("REPROVADO");
else if(mediaFinal==6)
System.out.println("PROVA FINAL");
else
System.out.println("APROVADO");
}  
}

Sem a devida identação a leitura e a orientação é dificil, contudo mesmo sem a identação se a escrita do código estiver correta o mesmo funcionará normalmente, pois a identação não influencia. (vale ressaltar que existem linguagens que a identação é fundamental na estrutura do código)
*/