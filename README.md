# TrabalhoGit-Github

# Atividade Avaliativa - Git Colaborativo com Java

## Integrantes do grupo
- Brian Costa
- Fernando Teixeira 
- Caio Ribas

## Objetivo
Desenvolver colaborativamente um sistema que recebe um número e identifica se esse número é par ou ímpar

## Etapas realizadas por cada membro
### Caio Ribas
- Como criou?
  Acessei o github, fui em criar repositório, dei a ele um nome e optei por adicionar um readMe no processo de criação
  
- Como Configurou o Git? não deixe exposto sua chave.
  Com o git e chaves já configuradas em meu PC, em meu repositório fui em "code", "SSH" e copiei este URL.
  No IntelliJ clonei o repositório usando a URL
  
- Criei um modulo java e criei a nossa classe ParOuImpar, juntamento com o atributo int numero e instanciei o scanner para leitura do número

### Brian Costa
- Como Configurou o Git? não deixe exposto sua chave.

  compuni@maker262 MINGW64 ~
$ git config --global user.name "Brian Costa"

compuni@maker262 MINGW64 ~
$ git config --global user.email "brian.costa@edu.unifil.br"

compuni@maker262 MINGW64 ~
$ ssh-keygen -t rsa -b 4096 -C "brian.costa@edu.unifil.br"
Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/compuni.UNIFIL/.ssh/id_rsa): 
Created directory '/c/Users/compuni.UNIFIL/.ssh'.
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /c/Users/compuni.UNIFIL/.ssh/id_rsa
Your public key has been saved in /c/Users/compuni.UNIFIL/.ssh/id_rsa.pub
The key fingerprint is: (Chave)
The key's randomart image is: (Chave)

compuni@maker262 MINGW64 ~
$ eval "$(ssh-agent -s)"
Agent pid 1535

compuni@maker262 MINGW64 ~
$ ssh-add ~/.ssh/id_rsa
Identity added: /c/Users/compuni.UNIFIL/.ssh/id_rsa (brian.costa@edu.unifil.br)

compuni@maker262 MINGW64 ~
$ clip < ~/.ssh/id_rsa.pub

compuni@maker262 MINGW64 ~
$ ssh -T git@github.com
The authenticity of host 'github.com (4.228.31.150)' can't be established.
ED25519 key fingerprint is SHA256:+DiY3wvvV6TuJJhbpZisF/zLDA0zPMSvHdkr4UvCOqU.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added 'github.com' (ED25519) to the list of known hosts.
Hi briancosta-px! You've successfully authenticated, but GitHub does not provide shell access.

compuni@maker262 MINGW64 ~
$ ssh -T git@github.com
Hi briancosta-px! You've successfully authenticated, but GitHub does not provide shell access.

- Clonou o projeto base de Caio Ribas
  
- Adicionou lógica de entrada de dados e psvm 
 

### Fernando Teixeira
- Como Configurou o Git? não deixe exposto sua chave.
- Fez `git pull` após o commit de Ciclana.
- Finalizou o algoritmo com lógica . . .


## Comandos utilizados
Todos os comandos foram executados via terminal utilizando chave SSH:

### Comandos de Caio Ribas
-git clone ...URL...

-git add .

-git commit -m "Criar classe, atributo, e scanner"

-git push -u origin main

-git pull depois para ver as alterações feitas pelos outros


### Comandos de Brian Costa
-git clone ...URL...

-git add .

-git commit -m "Add entrada de dados e psvm"

-git push -u origin main

-git pull depois para ver versão final do código

### Comandos de Fernando Teixeira


## Observações
Cada etapa foi realizada por apenas um integrante por vez, 
respeitando a ordem de commits e a integridade do código.
