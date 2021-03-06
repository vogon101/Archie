![logo](https://raw.githubusercontent.com/vogon101/Archie/master/images/Logo2.jpg "Logo")

A simple programming language created in scala

## What is Archie
Archie is a small, general purpose, embeddable programming language created from scratch in
scala as a project for school. It is designed to be easily contained within JVM applications
to allow application developers to give their users access to custom scripts.

## Structure
Archie is an interpreted language and is organised into the following major sub-systems:
 
                    ----------------------------
    External API -> |Parsing -> (AST + Runtime)|
                    ----------------------------
                    
The external API is designed to make working with Archie in the host language as easy as
possible. The core of the language is in the Parsing and Runtime sub-systems which allow
execution of archie code. The Parser takes in code and produces an Abstract Syntax Tree
which can then be executed

### Internal
Internally the language is represented by an AST. This is a wrapper on `List[Line]`. A `Line` is
one of three things:
* `Comment` - A one line comment
* `ClassDef` - A class definition 
* `Element` - The core atom of the library

Anything that isn't a direct subtype of `Line` will be an Element. The main difference is that an
Element must return a value (even if it is a void) when run whilst a Line does not. This may change
in the future. The AST is immutable and has no knowledge of state so the only way to use it is to
traverse it. The Archie core library provides two ways of doing this: `ASTTransform` and `ASTVisitor`.
`ASTVisitor` is an implementation of the visitor pattern whilst `ASTTransform` uses an anonymous function
 which assumes pattern matching.
 
 Interpretation is implemented as an `ASTVisitor` with all the state separated from the actual tree.

## The language
The language has a number of influences both syntactically and conceptually

* Dynamic Typing - As this is a scripting language designed for extending existing
    applications I have decided on dynamic typing. It will be similar to the typing
    seen in javascript or python  
* C-Like syntax - Archie will use syntax familliar to any C++, C# or Java programmer 
    with semi-colons, curly braces and `if (condition) {}` expressions
* Syntactic Sugar - My personal favourite language is scala as such many of the more "nice
    to have" features will be borrowed from there and other FP languages
    * Function application with the `apply` method
    * Higher Order Functions
    * Maximised use of expressions over statements
        * To minimise "Special Cases" I intend to make as many things as possible `Elements`
            (Expressions that can return a value) instead of `Lines` (Statements that can't).
        * This *should* allow greater flexibility and ease of use
    * Optional Semi-colons - I intend to make semicolons optional to give the language a greater
        "flow"
        
##Some Example code
```scala
class Person (name, yearOfBirth) {
    
    this.age = () => {
      return currentYear - yearOfBirth;
    }
    
    this.apply = () => {
        return "Person (" + name + ")"
    }
    
    //Yes I know this is a stupid function but who cares
    this.+ = (years) => {
        return new Person(name, yearOfBirth+years)
    }
    
    this.+= = (years) => {
        this.yearOfBirth = this.yearOfBirth + years
    }
    
}

currentYear = 2016
freddie = new Person("Freddie", 2000)

println(freddie.age()) //Prints 4
println(freddie()) //Prints "Person (Freddie)"

freddie.name = "Freddie Poser"
println(freddie()) // Prints "Person (Freddie Poser)"

newFreddie = freddie + 1
println(freddie.yearOfBirth) //Prints 2000
println(newFreddie.yearOfBirth) //Prints 2001

freddie += 2
println(freddie.yearOfBirth) //prints 2002
println(newFreddie.yearOfBirth) //Prints 2001
```

##Roadmap
- ~~Parsing~~
- ~~Visitor and Transform Framework~~
- ~~Simple File Application for testing~~
- Interpreter
    - ~~Type Backend~~
    - Element Implementations
    - Standard Library
- API
- Optimisation framework
- Custom IL Compiler (writes the AST to a file as an intermediate representation that is easy to parse,
improving speed when running code
- Online try-out site

##TODO:
* Allow comments inside of a `CodeBlock`
    * Perhaps make comments some sort of element
* Make assignments lines then allow lines inside of a codeblock
* return statements
* if and while
* Apply syntax?
* Function calls inside of objects need object scope

##Contributing
I will not be accepting contributions at the moment as this is a project for school

##Licence 
<a rel="license" href="http://creativecommons.org/licenses/by/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by/4.0/88x31.png" /></a>

<span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">Archie</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://vogonjeltz.com" property="cc:attributionName" rel="cc:attributionURL">Freddie Poser</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by/4.0/">Creative Commons Attribution 4.0 International License</a>.