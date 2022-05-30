import java.util.*;

public class Acai {
    private static Scanner input = new Scanner(System.in);
          public static void main(String[] args) {                                                                                                                                                                                
        String nome;
        double tamanho, numcomplemento, complementos, complemento2, complemento3, valor;
        
        System.out.println("Olá! Bem vindo a nossa Açaiteria! Informe sue nome:");
        nome = input.nextLine();
        System.out.println("Os tamanhos disponiveis são:");
        System.out.println("200ml - R$ 5,00");
        System.out.println("300ml - R$ 6,00");
        System.out.println("500ml - R$ 8,00");
        System.out.println("700ml - R$ 10,00");
        System.out.println("Qual o tamanho do açaí que você gostaria? 1 para 200ml, 2 para 300ml, 3 para 500ml e 4 para 700ml");
        tamanho = input.nextDouble();
        if (tamanho == 1) {
            System.out.println("A lista de complementos disponiveis em nossa Açaiteria é Leite em pó, Leite condensado, Granola, Banana. Sendo cada complemento R$ 2,50");
            System.out.println("Quantos complementos você vai querer? 1, 2, 3 ou 4");
            numcomplemento = input.nextDouble();
            if (numcomplemento == 1) {
                System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                complementos = input.nextDouble();
                System.out.print(nome);
                System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                System.out.print("O valor de sua compra foi R$: ");
                valor = 5.0 + 2.5;
                System.out.println(valor);
                System.out.println("Agradecemos a preferência!");
            } else {
                if (numcomplemento == 2) {
                    System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                    System.out.println("Digite o núemero do primeiro complememto:");
                    complementos = input.nextDouble();
                    System.out.println("Digite o núemero do segundo complememto:");
                    complemento2 = input.nextDouble();
                    System.out.print(nome);
                    System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                    System.out.print("O valor de sua compra foi R$: ");
                    valor = 5.0 + 2.5 * 2;
                    System.out.println(valor);
                    System.out.println("Agradecemos a preferência!");
                } else {
                    if (numcomplemento == 3) {
                        System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                        System.out.println("Digite o núemero do primeiro complememto:");
                        complementos = input.nextDouble();
                        System.out.println("Digite o núemero do segundo complememto:");
                        complemento2 = input.nextDouble();
                        System.out.println("Digite o núemero do terceiro complememto:");
                        complemento3 = input.nextDouble();
                        System.out.print(nome);
                        System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                        System.out.print("O valor de sua compra foi R$: ");
                        valor = 5.0 + 2.5 * 3;
                        System.out.println(valor);
                        System.out.println("Agradecemos a preferência!");
                    } else {
                        System.out.println("Você terá todos os complementos disponóveis");
                        System.out.print(nome);
                        System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                        System.out.print("O valor de sua compra foi R$: ");
                        valor = 5.0 + 2.5 * 4;
                        System.out.println(valor);
                        System.out.println("Agradecemos a preferência!");
                    }
                }
            }
        } else {
            if (tamanho == 2) {
                System.out.println("A lista de complementos disponiveis em nossa Açaiteria é Leite em pó, Leite condensado, Granola, Banana. Sendo cada complemento R$ 2,50");
                System.out.println("Quantos complementos você vai querer? 1, 2, 3 ou 4");
                numcomplemento = input.nextDouble();
                if (numcomplemento == 1) {
                    System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                    complementos = input.nextDouble();
                    System.out.print(nome);
                    System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                    System.out.print("O valor de sua compra foi R$: ");
                    valor = 6.0 + 2.5;
                    System.out.println(valor);
                    System.out.println("Agradecemos a preferência!");
                } else {
                    if (numcomplemento == 2) {
                        System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                        System.out.println("Digite o núemero do primeiro complememto:");
                        complementos = input.nextDouble();
                        System.out.println("Digite o núemero do segundo complememto:");
                        complemento2 = input.nextDouble();
                        System.out.print(nome);
                        System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                        System.out.print("O valor de sua compra foi R$: ");
                        valor = 6.0 + 2.5 * 2;
                        System.out.println(valor);
                        System.out.println("Agradecemos a preferência!");
                    } else {
                        if (numcomplemento == 3) {
                            System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                            System.out.println("Digite o núemero do primeiro complememto:");
                            complementos = input.nextDouble();
                            System.out.println("Digite o núemero do segundo complememto:");
                            complemento2 = input.nextDouble();
                            System.out.println("Digite o núemero do terceiro complememto:");
                            complemento3 = input.nextDouble();
                            System.out.print(nome);
                            System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                            System.out.print("O valor de sua compra foi R$: ");
                            valor = 6.0 + 2.5 * 3;
                            System.out.println(valor);
                            System.out.println("Agradecemos a preferência!");
                        } else {
                            System.out.println("Você terá todos os complementos disponóveis");
                            System.out.print(nome);
                            System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                            System.out.print("O valor de sua compra foi R$: ");
                            valor = 6.0 + 2.5 * 4;
                            System.out.println(valor);
                            System.out.println("Agradecemos a preferência!");
                        }
                    }
                }
            } else {
                if (tamanho == 3) {
                    System.out.println("A lista de complementos disponiveis em nossa Açaiteria é Leite em pó, Leite condensado, Granola, Banana. Sendo cada complemento R$ 2,50");
                    System.out.println("Quantos complementos você vai querer? 1, 2, 3 ou 4");
                    numcomplemento = input.nextDouble();
                    if (numcomplemento == 1) {
                        System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                        complementos = input.nextDouble();
                        System.out.print(nome);
                        System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                        System.out.print("O valor de sua compra foi R$: ");
                        valor = 8.0 + 2.5;
                        System.out.println(valor);
                        System.out.println("Agradecemos a preferência!");
                    } else {
                        if (numcomplemento == 2) {
                            System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                            System.out.println("Digite o núemero do primeiro complememto:");
                            complementos = input.nextDouble();
                            System.out.println("Digite o núemero do segundo complememto:");
                            complemento2 = input.nextDouble();
                            System.out.print(nome);
                            System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                            System.out.print("O valor de sua compra foi R$: ");
                            valor = 8.0 + 2.5 * 2;
                            System.out.println(valor);
                            System.out.println("Agradecemos a preferência!");
                        } else {
                            if (numcomplemento == 3) {
                                System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                                System.out.println("Digite o núemero do primeiro complememto:");
                                complementos = input.nextDouble();
                                System.out.println("Digite o núemero do segundo complememto:");
                                complemento2 = input.nextDouble();
                                System.out.println("Digite o núemero do terceiro complememto:");
                                complemento3 = input.nextDouble();
                                System.out.print(nome);
                                System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                                System.out.print("O valor de sua compra foi R$: ");
                                valor = 8.0 + 2.5 * 3;
                                System.out.println(valor);
                                System.out.println("Agradecemos a preferência!");
                            } else {
                                System.out.println("Você terá todos os complementos disponóveis");
                                System.out.print(nome);
                                System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                                System.out.print("O valor de sua compra foi R$: ");
                                valor = 6.0 + 2.5 * 4;
                                System.out.println(valor);
                                System.out.println("Agradecemos a preferência!");
                            }
                        }
                    }
                } else {
                    System.out.println("A lista de complementos disponiveis em nossa Açaiteria é Leite em pó, Leite condensado, Granola, Banana. Sendo cada complemento R$ 2,50");
                    System.out.println("Quantos complementos você vai querer? 1, 2, 3 ou 4");
                    numcomplemento = input.nextDouble();
                    if (numcomplemento == 1) {
                        System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                        complementos = input.nextDouble();
                        System.out.print(nome);
                        System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                        System.out.print("O valor de sua compra foi R$: ");
                        valor = 10.0 + 2.5;
                        System.out.println(valor);
                        System.out.println("Agradecemos a preferência!");
                    } else {
                        if (numcomplemento == 2) {
                            System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                            System.out.println("Digite o núemero do primeiro complememto:");
                            complementos = input.nextDouble();
                            System.out.println("Digite o núemero do segundo complememto:");
                            complemento2 = input.nextDouble();
                            System.out.print(nome);
                            System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                            System.out.print("O valor de sua compra foi R$: ");
                            valor = 10.0 + 2.5 * 2;
                            System.out.println(valor);
                            System.out.println("Agradecemos a preferência!");
                        } else {
                            if (numcomplemento == 3) {
                                System.out.println("Qual complemento vc deseja? 1 para leite em pó, 2 para leite condensado, 3 para granola, 4 para banana:");
                                System.out.println("Digite o núemero do primeiro complememto:");
                                complementos = input.nextDouble();
                                System.out.println("Digite o núemero do segundo complememto:");
                                complemento2 = input.nextDouble();
                                System.out.println("Digite o núemero do terceiro complememto:");
                                complemento3 = input.nextDouble();
                                System.out.print(nome);
                                System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                                System.out.print("O valor de sua compra foi R$: ");
                                valor = 10.0 + 2.5 * 3;
                                System.out.println(valor);
                                System.out.println("Agradecemos a preferência!");
                            } else {
                                System.out.println("Você terá todos os complementos disponóveis");
                                System.out.print(nome);
                                System.out.println(" pegue o açaí em nossa bancada assim que chamarmos o seu nome");
                                System.out.print("O valor de sua compra foi R$: ");
                                valor = 6.0 + 2.5 * 4;
                                System.out.println(valor);
                                System.out.println("Agradecemos a preferência!");
                            }
                        }
                    }
                }
            }
        }
    }
}

