FROM openjdk:8
COPY . /usr/src/splitstring
WORKDIR /usr/src/splitstring
RUN javac SplitStringIter.java
CMD ["java", "SplitStringIter"]
