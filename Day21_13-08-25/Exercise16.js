 const images = [
      "allu-arjun-ed.webp",
      "download (1).jpg",
      "download (2).jpg",
      "High_resolution_wallpaper_background_ID_77701212827.webp",
      "iron-man-3-movie-poster-wallpaper-1440x900_4.jpg"
    ];

    let currentIndex = 0;

    function updateGallery() {
      const img = document.getElementById("galleryImage");
      img.src = images[currentIndex];


      document.getElementById("prevBtn").disabled = currentIndex === 0;
      document.getElementById("nextBtn").disabled = currentIndex === images.length - 1;
    }

    function showNext() {
      if (currentIndex < images.length - 1) {
        currentIndex++;
        updateGallery();

      }
    }

    function showPrev() {
      if (currentIndex > 0) {
        currentIndex--;
        updateGallery();
      }
    }

  
    updateGallery();