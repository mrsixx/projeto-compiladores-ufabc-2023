<template>
      <q-tree
        :nodes="tree"
        node-key="label"
        text-color="white"
        default-expand-all
        v-model:selected="selected"
      />
  </template>
  
  <script>
  import { ref } from 'vue';

  export default {
    name: 'DirectoryTree',
    props: {
        diretorios: Array
    },
    data() {
      return {
        selected: ref('arquivo1.isi'),
      };
    },
    mounted () {
        console.log(this.diretorios)
    },
    watch: {
      selected(filename) {
        this.$emit('open-file', filename)
      }
  },
    computed: {
      tree() {
        return [
          {
            label: '/',
            icon: 'folder',
            children: this.diretorios
          }
        ];
      }
    }
  }
  </script>
  <style>
    .q-scrollarea__content{
      background-color:#282a36b3;
    }
  </style>