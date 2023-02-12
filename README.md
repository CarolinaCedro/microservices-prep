# Microservices


## O que é um discovery server  ?

Imagine que você tem vários serviços que trabalham juntos em sua aplicação, como um serviço de pagamento, outro para gerenciamento de usuários, entre outros. Esses serviços precisam se comunicar uns com os outros para realizar suas tarefas.

Aqui é onde entra o conceito de um Eureka Server ou Discovery Server. Ele é basicamente um serviço que mantém um registro de todos os outros serviços que estão funcionando em sua aplicação. Quando um serviço precisa se comunicar com outro, ele pode perguntar ao Eureka Server sobre a localização (endereço IP e porta) do serviço que ele precisa acessar. Dessa forma, os serviços não precisam conhecer a localização uns dos outros diretamente, tornando mais fácil manter e escalar sua aplicação.

Por resumir, o Eureka Server é como uma central telefônica que sabe a localização de todos os serviços disponíveis na aplicação, facilitando a comunicação entre eles.


## O que é um gateway ? 
Um gateway é um componente que atua como um ponto de entrada para sua aplicação, controlando o tráfego de requisições entrantes e decidindo para onde elas devem ser encaminhadas. Isso é importante porque permite que você implemente funcionalidades comuns para todas as requisições, como autenticação, rate limiting, e redirecionamento, antes de elas serem encaminhadas aos serviços que as processam.

O Eureka Server pode ser usado em conjunto com um gateway para melhorar ainda mais a arquitetura da sua aplicação. O gateway pode consultar o Eureka Server para obter informações sobre os serviços disponíveis e seus endereços, e usar essas informações para encaminhar as requisições aos serviços corretos. Isso significa que o gateway não precisa conhecer diretamente a localização de cada serviço, o que torna mais fácil manter e escalar sua aplicação. Além disso, o uso do Eureka Server também permite que você implemente funcionalidades avançadas, como o balanceamento de carga e a failover, de forma mais fácil.

Em resumo, o Eureka Server e o gateway trabalham juntos para melhorar a arquitetura da sua aplicação, tornando-a mais escalável, flexível e fácil de manter.

## Nesse cenario de microservices o que seria uma comunicação sincrona e uma comunicação assincrona ?

Na comunicação síncrona, uma requisição é feita e a resposta é aguardada antes de continuar a execução. Isso significa que o processo que fez a requisição ficará bloqueado até que a resposta seja recebida. É como se você ligasse para um amigo e esperasse ele atender antes de continuar sua conversa.

Um exemplo de comunicação síncrona pode ser uma chamada a uma API REST, na qual o processo envia uma requisição e aguarda a resposta antes de continuar a execução.

Já na comunicação assíncrona, a requisição é feita e a execução continua sem esperar pela resposta. A resposta é recebida mais tarde, geralmente através de uma chamada de retorno (callback). É como se você enviasse uma mensagem para um amigo e continuasse suas atividades, sem precisar esperar por uma resposta imediata.

Um exemplo de comunicação assíncrona pode ser o uso de WebSockets, na qual o processo envia uma mensagem através de uma conexão aberta e continua a execução sem esperar pela resposta. Quando a resposta é recebida, uma chamada de retorno é chamada para processá-la.

## O que é um balanceamento de carga ? 
O balanceamento de carga em microserviços é uma técnica utilizada para distribuir o tráfego de solicitações de uma aplicação entre vários serviços, a fim de garantir a disponibilidade e o desempenho da aplicação.

Quando uma aplicação é composta por vários microserviços, é importante garantir que cada serviço esteja dimensionado corretamente para lidar com a quantidade de tráfego que ele está recebendo. O balanceamento de carga é utilizado para equilibrar o tráfego entre os serviços, de modo que nenhum deles seja sobrecarregado ou fique subutilizado.

Existem várias técnicas de balanceamento de carga, incluindo o balanceamento de carga baseado em peso, o balanceamento de carga round-robin e o balanceamento de carga inteligente baseado em algoritmos de aprendizado de máquina. O objetivo é distribuir de forma equilibrada a carga de trabalho entre os serviços, maximizando a disponibilidade e o desempenho da aplicação.
