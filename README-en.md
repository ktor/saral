## ŠARAL 2.0 - ŠARIŠ ALGORITMIK LENGVIDŽ 2.0

[Slovensky](README-SK.md)

*Not all features all currently supported. Full specification [here](specification.md)*

### Compiler
We need to have [`maven`](https://maven.apache.org/) installed.

Šaral source files have `srl` extension and we can compile it to JVM bytecode. It outputs `class` file. 

`java com.pidanic.saral.Compiler <saral_source_file.srl>`

Then run compiled program. 

`java <saral_source_file.class>`

### Program
Do not need to have `class`es. We declare few variables with `meňak` and print them to the console with `ciskaj`-
```
meňak neskutočné numeralio five = 5
ciskaj five
meňak slovo hello = "hello"
ciskaj hello
```

There are 2 data types supported - `neskutočné numeralio` (integer) a `slovo` (string).


#### Procedures
Do we repeat same code? No problem, we have procedures.
```
bar iDoSomething()
{
   meňak neskutočné numeralio three = 3
   ciskaj three
}
```

With `bar`, we declare procedure with name `iDoSomething`. It is without parameters. 

We can add parameters. They need to be in supported data types.
```
bar iDoSomethingElse(neskutočné numeralio x)
{
    ciskaj x
}
```

We call the procedure with `paľ do baru`
```
paľ do baru iDoSomething()

meňak neskutočné numeralio five = 5
paľ do baru iDoSomethingElse(five)

```