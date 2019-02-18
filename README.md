# HOW-TOs

## Чтобы создать проект с JMH c нуля через maven 
``mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.openjdk.jmh -DarchetypeArtifactId=jmh-java-benchmark-archetype -DgroupId=ru.spb.kupchinolab.otus.online_master.jmh -DartifactId=jmh -Dversion=1.0``

## Чтобы cобрать этот проект, если maven на компе есть
``cd <<директория с проектом>>``
``mvn clean install``

## Чтобы cобрать этот проект, если maven-а на компе нет
``cd <<директория с проектом>>``
``./mvnw clean install``

## После сборки артефакт с микробенчмарком находится тут
``<<директория с проектом>>/target/benchmarks.jar``

## Запуск микробенчмарка
``cd <<директория с проектом>>/target``
``java -jar benchmarks.jar``
