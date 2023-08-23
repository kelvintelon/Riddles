<template>
  <div id="app">
    <Riddles msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import Riddles from './components/RiddlesHomePage.vue'

export default {
  name: 'App',
  components: {
    Riddles
  }
  
}
</script>

<style>
* {
  margin: 0;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: white;
  min-height: 100vh;
  background-image: url('~@/assets/images/sphinxBackground.jpg');
  background-size: cover;
  background-repeat: no-repeat;
}

</style>
