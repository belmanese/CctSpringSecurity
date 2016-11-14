web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/*.war
web: java $JAVA_OPTS -cp target/classes:target/m2e-wtp/*.war com.cct.controller
worker: sh target/bin/worker 