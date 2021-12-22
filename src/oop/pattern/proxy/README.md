# Proxy  
It separates and encapsulates the access logic.   
Then from that class you can create other classes with additional features (like caching) and the final user don't see what's happening behind the scenes. The user only knows that he's using a `Factorial` implementation, but he doesn't know what is the implementation (if it is a simple factorial, a factorial with caching, ...)
