import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { AppLoading } from 'expo';
import { StyleSheet, View } from 'react-native';
import Header from './src/components/Header';
import Home from './src/pages/Home';
import { useFonts, Play_400Regular, Play_700Bold } from '@expo-google-fonts/play';

export default function App() {
  const [fontsLoaded] = useFonts({
    Play_400Regular,
    Play_700Bold
  });

  if (!fontsLoaded) {
    return <AppLoading />;
  } else {
    return (
      <View style={styles.container}>
        <Header />
        <Home />
        <StatusBar style="light" />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0B1F34'
  }
});
