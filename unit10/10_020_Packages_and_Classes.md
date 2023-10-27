# 10.020 📦 Packages and Classes 📦

## The problem of naming things

> There are only two hard things in Computer Science: cache invalidation and naming things.     -- Phil Karlton

## The Namespace Problem

Not a major problem when almost all programs were written "in house."  

As software became more sophisticated, it started incorporating other software.  That created naming conflicts.

The problem was that each software developer needed to have a unique "Namespace."  

### The Namespace Problem in our class

Last week I made a point of naming my methods "parseInt" and "parseDouble."  I even used the same data types as an argument so that the methods had the same signature.  It worked because my method was created in a different namespace of the Main class.  The full name of the three potentially conflicting methods was Double.parseDouble(), Integer.parseInt(), Main.parseDouble(), and Main.parseInt().  Java just let me skip typing out the Main. when I was calling methods in the same class.

### What about a namespace for Classes?

But what about names of classes?  Is there a way to protect class names so we don't have to worry about duplicating them?  

Yes, there are!  There is something called a package.  But then the question becomes how do we make sure that package names are protected from duplication?

## Domain Names

Internet domains are guaranteed to be unique to a single organization on a worldwide basis.

Domain names are a hierarchy.  The way they are normally written, the most general level is last.

1. (Highest) Top Level Domain, or TLD
2. (Lower) Second Level Domain, or SLD
3. (Lowest) Subdomains

![Domain Names Illustration](images/DomainName.svg)

The SLD plus the TLD are often called the "Domain Name."  

Domains at the TLD and SLD are registered worldwide.

Subdomains are completely under control of the owner of the SLD.

## Reverse order domain names

Package names for third-party begin with the domain name in reverse order.

For example, I own the domain noynaert.com.  So if I start my package names with `com.noynaert` Then I should not have a problem with anyone else duplicating my package names.

It is up the owner of the domain name to make sure there are no duplicate package names within their organization.

## Organization in Java

The package name is broken up into parts separated by periods.  Each segment of the name becomes a directory.  The classes are place within the directory structure based on the package name.