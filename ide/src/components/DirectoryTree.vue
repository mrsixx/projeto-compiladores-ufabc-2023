<template>
    <div class="">
      <q-tree
        :nodes="simple"
        node-key="label"
      />
    </div>
  </template>
  
  <script>
  export default {
    props: {
        diretorios: Array
    },
    mounted () {
        console.log(this.diretorios)
    },
    setup () {
      return {
        simple: [
          {
            label: '/',
            icon: 'folder',
            children: [
              {
                label: 'Good food (with icon)',
                icon: 'restaurant_menu',
                children: [
                  { label: 'Quality ingredients' },
                  { label: 'Good recipe' }
                ]
              },
              {
                label: 'Good service (disabled node with icon)',
                icon: 'room_service',
                disabled: true,
                children: [
                  { label: 'Prompt attention' },
                  { label: 'Professional waiter' }
                ]
              },
              {
                label: 'Pleasant surroundings (with icon)',
                icon: 'photo',
                children: [
                  {
                    label: 'Happy atmosphere (with image)',
                    img: 'https://cdn.quasar.dev/img/logo_calendar_128px.png'
                  },
                  { label: 'Good table presentation' },
                  { label: 'Pleasing decor' }
                ]
              }
            ]
          }
        ]
      }
    }
  }
  </script>