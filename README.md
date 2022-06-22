# SNHU-CS-305
SNHU CS-305 Software Security

**Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial is a company wanting to create a new online presence. Because money is on the line there is greater incentive to try and attack Artemis and for Artemis to be extra cautious.


**What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

Security at some level is required by law – especially where sensitive data is stored, e.g., personal identifiers or financial data. Security starts with the first line of code and the architectural decisions. Then from that point forward it is everyone’s responsibility to maintain best practices. Data breeches make first page headlines these days and can be very costly to users or owners of an application.
Security never stops, either. All code has a bug and will be outdated at some point in the future, so maintainability must also be baked into the architecture.

**What about the process of working through the vulnerability assessment did you find challenging or helpful?

While I have read the results of static tests many times, I had never performed a test myself, so that was helpful. I think adding in the ability to do dynamic testing would also be useful.

**How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?

Simply stated, never trust input. It doesn’t matter is the input is a user string or from a database never trust it. Always do some sort of sanitization to prevent errant behaviors or worse.

**What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?

Maven is used all over the industry. Seeing and using Maven was quite useful. 

**Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?

I think building the Spring API where we had to generate a checksum is the most complete assignment. It touched on many aspects of the Spring, security, and general coding practices. 

