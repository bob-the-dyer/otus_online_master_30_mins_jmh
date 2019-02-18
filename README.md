# HOW-TOs

## Чтобы создать проект с JMH c нуля через maven
TODO добавить маркап кода 
mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.openjdk.jmh -DarchetypeArtifactId=jmh-java-benchmark-archetype -DgroupId=ru.spb.kupchinolab.otus.online_master.jmh -DartifactId=jmh -Dversion=1.0

## Чтобы cобрать этот проект 
cd <<директория с проектом>>
запуск вложеного мавена clean package

## Артефакт с микробенчмарком находится тут
<<директория с проектом>>/target/benchmarks.jar

## Запуск микробенчмарка
cd <<директория с проектом>>/target
java -jar benchmarks.jar
>>>
