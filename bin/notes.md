# Notas para Melhorias Futuras

## Melhorias Planejadas

### Implementação Automática de Salário

- **Objetivo**: Automatizar a definição de salário com base no cargo selecionado.
- **Descrição**: Quando um cargo for escolhido, o código deve automaticamente definir o salário correspondente ao cargo selecionado.
- **Passos a Seguir**:
    1. Realizar documentação do codigo e funções.
    2. Criar uma estrutura de dados (por exemplo, um dicionário) que mapeie cargos aos seus respectivos salários.
    3. Implementar uma função que receba o cargo como entrada e retorne o salário correspondente.
    4. Integrar essa função ao fluxo de seleção de cargo no código existente.
    5. Testar a implementação para garantir que o salário é definido corretamente ao selecionar um cargo.

- **Notas Adicionais**:
    - Verificar se há cargos novos ou alterações nos salários periodicamente.
    - Considerar a possibilidade de adicionar uma interface de administração para atualizar cargos e salários.

### Exemplo de Estrutura de Dados

```python
cargos_salarios = {
        "Gerente": 5000,
        "Desenvolvedor": 4000,
        "Analista": 3500,
        "Estagiário": 1500
}

def definir_salario(cargo):
        return cargos_salarios.get(cargo, "Cargo não encontrado")
```

### Integração no Código

- Integrar a função `definir_salario` no ponto onde o cargo é selecionado pelo usuário.
- Atualizar a interface do usuário para refletir automaticamente o salário definido.
