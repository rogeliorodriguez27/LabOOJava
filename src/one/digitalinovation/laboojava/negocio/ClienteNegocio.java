package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * @author thiago leite
 */
public class ClienteNegocio {

    /**
     * {@inheritDoc}.
     */
    private Banco bancoDados;

    /**
     * Construtor.
     * @param banco Banco de dados para ter acesso aos clientes cadastrados
     */
    public ClienteNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    /**
     * Consulta o cliente pelo seu CPF.
     * @param cpf CPF de um cliente
     * @return O cliente que possuir o CPF passado.
     */

    public Optional<Cliente> consultar(String cpf) {
        for (Cliente cliente : bancoDados.getClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return Optional.of(cliente);
            }
        }
            
        return Optional.empty();
        }
    
        /**

    /**
     * Cadastra um novo cliente.
     * @param cliente Novo cliente que terá acesso a aplicação
     */
        //*TODO* Fazer a inclusão de cliente
    //Resolvido
    public void salvar(Cliente novoCliente) {

        boolean clienteRepetido = false;
        for (Cliente cliente: bancoDados.getClientes()) {
            if (cliente.getCpf().equalsIgnoreCase(novoCliente.getCpf())  ) {
                clienteRepetido = true;
                System.out.println("Cliente já cadastrado.");
                break;
            }
        }

        if (!clienteRepetido) {
            this.bancoDados.adicionarCliente(novoCliente);
            System.out.println("Cliente cadastrado com sucesso.");
        }
    }


    /**
     * Exclui um cliente específico.
     * @param cpf CPF do cliente
     */

    public void excluir(String cpf) {
        //*TODO* Implementar a exclusão
        //RESOLVIDO

            int clienteExclusao = -1;
            for (int i = 0; i < bancoDados.getClientes().length; i++) {
    
                Cliente cliente = bancoDados.getClientes()[i];
                if (cliente.getCpf().equals(cpf)) {
                    clienteExclusao = i;
                    break;
                }
            }
    
            if (clienteExclusao != -1) {
                bancoDados.removerCliente(clienteExclusao);
                System.out.println("Cliente excluído com sucesso.");
            } else {
                System.out.println("Cliente inexistente.");
            }
        
    
    }

  

}
