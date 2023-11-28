const { spawn } = require('child_process');

// Spawn Java process
const javaProcess = spawn('java', ['InterProcessCommunicationJava']);

// Listen for data from Java
javaProcess.stdout.on('data', (data) => {
  console.log('Node.js received from Java:', data.toString().trim());
});

// Send message to Java
javaProcess.stdin.write('Hello from Node.js');
javaProcess.stdin.end();
