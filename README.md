# Симона Настоска 236001
## Control Flow Graph
![CFG drawio](https://github.com/user-attachments/assets/5969d400-0764-4ced-81d9-8069475307dd)
## Цикломатска комплексност
   Цикломатска комплексност е 9.
   Може според бројот на предикатни јазли + 1, во овој случај имаме 8 предикатни јазли B, E2, G, I, K, N, Q2 и S.
   Исто така може и бројот на ребра минус бројот на јазли + 2. Во овој случај 34 - 27 + 2 = 9.
## Тест случаи според критериумот Every Statement
1. allItems = null, cardNumber = "1231"
2. allItems = List.of(new Item("item0", 10, 100, 0.2), new Item("item1", 9, 105, 0.0), new Item("", 0, 305,0.0)), cardNumber = "123456789120546"
3. allItems = List.of(new Item("item3", 10, 100, 0.2)), cardNumber = "123*478503695444"
4. allItems = new Item("item2", 10, 100, 0.2), cardNumber = null
5. allItems = List.of(new Item("item4", 10, 100, 0.1)), cardNumber = "1234445559980011"
## Тест случаи според критериумот Multiple Condition
1. allItems = List.of(new Item("item0", 10, 310, 0)), cardNumber = "1234445559980011"
2. allItems = List.of(new Item("item1", 10, 200, 0.1)), cardNumber = "1234445559980011"
3. allItems = List.of(new Item("item2", 10, 100, 0)), cardNumber = "1234445559980011"

## Објаснување на напишаните unit tests
### Every statement
Минимален број на тест случаи 5.
1. Нaјпрво требa да се активира throw new RuntimeException("allItems list can't be null!")
Овa ќе го постигнеме со тест во кој allItems = null, а cardNmber може да биде било што. Ќе се извршат јазлите A, B, C.
2. Потоa RuntimeException("Invalid item!");
Овде може да направиме листа од елементи што ќе поминат низ сите јазли и крајниот елемент да биде тој што ќе влезе во RuntimeException, пример item.getName().length() == 0 за последниот елемент и методата ќе заврши.
cardNumber може и тукa дa биде било што.
3. RuntimeException("Invalid character in card number!");
Исто и тука за елементите на листата, а во cardNumber ќе се содржи некој кaрaктер што не е цифрa, односно не се содрчи во стрингот allowed.  
4. RuntimeException("Invalid card number!");
allItems нека биде листа што нема на фрли exception, а во овој јазол ќе влезе со тестот cаrdNumber = null или должината да не биде точно 16.
5. И нa крaј нормaлно извршувaње нa прогрaмaтa, односно дa се изврши return sum;
Тест пример каде што листата со елементи ќе биде според бараните правила и cardNumber ќе биде стринг што ги задволува условите.
### Multiple Condition
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
Минимален број на тест случаи 3.
1. T || X || X
   Пишувaме тест пример кaде што првиот услов од if-от ќе биде исполнет, остaнaтите двa услови може дa се било што зaтоa што ќе врaти true без рaзликa нa тие двa услови.
2. F || T || X
   Првиот тест пример дa биде false, а вториот true, третиот може да биде било што.
4. F || F || F
   Сите услови да бидат false.
