

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        int opcao = 0;
        System.out.println("Bem-vindo ao seu Gerenciador de Tarefas!");

        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = leitor.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int numeroTarefa = leitor.nextInt();
                    if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
                        tarefas.remove(numeroTarefa - 1);
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do Gerenciador de Tarefas. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}
