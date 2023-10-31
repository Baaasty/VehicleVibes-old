<template>
  <AppHeader />
  <RouterView />
</template>

<script setup>
import { RouterView } from 'vue-router';
import AppHeader from '@/components/AppHeader.vue';
</script>

<style lang="scss">
@import url('https://fonts.googleapis.com/css2?family=Rubik&family=Rubik+Mono+One&display=swap');

#app {
  font-family: 'Rubik', sans-serif;
}

body {
  margin: 50;
  padding: 0;
}
</style>
