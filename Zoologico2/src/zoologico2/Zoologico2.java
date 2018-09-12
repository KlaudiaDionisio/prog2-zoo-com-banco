/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico2;

import animal.Animal;
import animal.aves.Gaviao;
import animal.mamiferos.Baleia;
import animal.peixe.Tubarao;
import animal.repteis.Jararaca;
import excecoes.AnimalFugiuException;
import excecoes.AnimalNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import zoologico2.funcionarios.Funcionario;
import zoologico2.funcionarios.Veterinario;

/**
 *
 * @author a400984
 */
public class Zoologico2 {

   // Animal animais[] = new Animal[5]; // reunir todos animais
    ArrayList<Animal> animais;
    ArrayList<Funcionario> func;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Veterinario vet1 = new Veterinario();
        //Veterinario vet2 = new Veterinario();
        int opcao = -1;
        Zoologico2 zoo = new Zoologico2();
        zoo.animais = new ArrayList<>();
        zoo.func = new ArrayList<>();
        zoo.exemploExcecao();
        
        /*
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:" + "\n1 - Cadastrar animal"
                    + "\n2 - Exibir animais"
                    + "\n3 - Remover animal"
                    + "\n0 - Sair"));

            switch (opcao) {
                case 1:
                    zoo.cadastrarAnimal();
                    break;
                case 2:
                    zoo.exibirAnimais();
                    break;
                case 3:
                    try{
                        zoo.removerAnimal();
                    }catch(AnimalNotFoundException ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                    
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 0);*/
    }
    
    private void exemploExcecao(){
        Animal animais[] = new Animal[3];
        for(int i = 0; i < 4; i++){
            try{
            animais[i] = new Baleia();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("deu arrayindex...");
            }catch(Exception e){
                System.out.println("deu erro exception: " + e.getMessage());
            }finally{
                System.out.println("finalmente...");
            }
        }
    }

    private void cadastrarAnimal() {  // vai ser usado só nessa classe
        Animal novoAnimal = null; // default
        int especie = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo:"
                + "\n1 - Gaviao"
                + "\n2 - Baleia"
                + "\n3 - Tubarao"
                + "\n4 - Jararaca"));
        switch (especie) {
            case 1:
                novoAnimal = new Gaviao();
                break;
            case 2:
                novoAnimal = new Baleia();
                break;
            case 3:
                novoAnimal = new Tubarao();
                break;
            case 4:
                novoAnimal = new Jararaca();
                break;
        }
        String nome = JOptionPane.showInputDialog("Digite o nome do animal: ");
        novoAnimal.setNome(nome);
//        for (int i = 0; i < animais.length; i++) {
//            if (animais[i] == null) {
//                animais[i] = novoAnimal;
//                break;
//            }
//        }

        animais.add(novoAnimal);
        JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
    }

    private void exibirAnimais(){
        throw new AnimalFugiuException("Animal fugiu!");
//        String mensagem = "Animais";
////        for (int i = 0; i < animais.length; i++) {
////            if (animais[i] != null) {
////                mensagem += "\n" + animais[i].getNome();
////            }
////        }
//
//        for(Animal a : animais){
//            mensagem += "\n" + a.getNome();
//        }
//        JOptionPane.showMessageDialog(null, mensagem);
    }

    private void removerAnimal() throws AnimalNotFoundException{
        String nome = JOptionPane.showInputDialog("Digite o nome do animal: ");
        boolean removido = false;
//        for (int i = 0; i < animais.length; i++) {
//            if (animais[i] != null) {
//                if (animais[i].getNome().equals(nome)) {
//                    animais[i] = null;
//                    removido = true;
//                    
//                }
//            }
//        }
            for (int i = 0; i < animais.size(); i++) {
                Animal a = animais.get(i);
                if (a.getNome().equals(nome)) {
                    animais.remove(i);
                    removido = true;
                }
            }
        if(removido == true){
            JOptionPane.showMessageDialog(null, "Animal excluido com sucesso!");
        }else{
            //JOptionPane.showMessageDialog(null, "Animal não encontrado!");
            throw new AnimalNotFoundException("Animal não encontrado!");
        }
        
    }
}
