import 'package:flutter/material.dart';

void main() {
  runApp(

    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.teal,
          title: Text('Medipredict', style: TextStyle(color: Colors.white)),
        ),
      ),
    ),
  );
}
