# solidPrinciples
Developed a product example to explain solid principles
1)single responsibilty:
                The product example has two functions DisplayProduct and Validate as these two don't imply same functionality or responsibilty we can seperate them                 into separate classes.
2)Closed to modification and open to extension:
                we have a class Discount where its child classes KLMMall and CMRMall wants to extend this class and want to provide their own discount percentage                   and this exactly follows rules.
3)Liskov's Substitution Principle:
`               we have a class Delivery which is providing function to track status of product delivery its child classes hyderabad and bangalore should be able                   access track method and should perform same operation like same delivery via hyderbad and via banglore accordingly.
4)Interface seggregation principle:
                Always interfaces shoulnot be combined .we have interfaces category and sort with category implemeted by classes like jewallary and watch.similary                  sort implemented by reviews and prices.
 5)7deendency inversion:Higher level modules shouldnot depend on lower level modules rather depend on abstraction so in this example moneyconversion interface is                 implemented by dollar and rupee class .               
